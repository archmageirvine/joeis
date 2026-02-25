package irvine.oeis.a393;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

import irvine.math.partition.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A393539 allocated for Darij Grinberg.
 * @author Sean A. Irvine
 */
public class A393539 extends Sequence0 {

  // After Darij Grinberg

  private int mN = -1;

  private static boolean hasDesarrangementTableau(final int[] mu) {
    return mu.length != 1 && !(mu.length % 2 == 1 && mu[0] == 1);
  }

  private static int[] trim(final int[] mu) {
    int len = mu.length;
    while (len > 0 && mu[len - 1] == 0) {
      --len;
    }
    if (len == mu.length) {
      return mu;
    }
    final int[] t = new int[len];
    System.arraycopy(mu, 0, t, 0, len);
    return t;
  }

  private static void backtrack(final int[] lambda, final int[] r, final int k, final int remaining, final ArrayList<int[]> result) {
    if (k == lambda.length) {
      if (remaining == 0) {
        final int[] mu = new int[lambda.length];
        for (int j = 0; j < lambda.length; ++j) {
          mu[j] = lambda[j] - r[j];
        }
        result.add(trim(mu));
      }
      return;
    }

    final int next = (k + 1 < lambda.length) ? lambda[k + 1] : 0;
    final int max = lambda[k] - next;
    for (int t = 0; t <= max && t <= remaining; ++t) {
      r[k] = t;
      backtrack(lambda, r, k + 1, remaining - t, result);
    }
    r[k] = 0;
  }

  private static ArrayList<int[]> removeHorizontalBorderStrip(final int[] lambda, final int k) {
    final ArrayList<int[]> result = new ArrayList<>();
    backtrack(lambda, new int[lambda.length], 0, k, result);
    return result;
  }

  private static ArrayList<Integer> skewContents(final int[] lambda, final int[] mu) {
    final ArrayList<Integer> contents = new ArrayList<>();
    final int rows = lambda.length;
    for (int k = 0; k < rows; ++k) {
      final int lk = lambda[k];
      final int mk = k < mu.length ? mu[k] : 0;
      for (int j = mk + 1; j <= lk; ++j) {
        contents.add(j - (k + 1));  // k+1 because Sage uses 1-based rows
      }
    }
    Collections.sort(contents);
    return contents;
  }

  @Override
  public Z next() {
    ++mN;
    final HashSet<List<Integer>> contentSets = new HashSet<>();
    final IntegerPartition part = new IntegerPartition(mN);
    int[] lambda;
    while ((lambda = part.next()) != null) {
      for (int k = 0; k <= mN; ++k) {
        for (final int[] mu : removeHorizontalBorderStrip(lambda, k)) {
          if (hasDesarrangementTableau(mu)) {
            final ArrayList<Integer> contents = skewContents(lambda, mu);
            contentSets.add(List.copyOf(contents));
          }
        }
      }
    }
    return Z.valueOf(contentSets.size());
  }
}
