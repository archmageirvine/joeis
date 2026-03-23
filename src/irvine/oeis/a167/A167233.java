package irvine.oeis.a167;

import java.util.ArrayList;
import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.FiniteSequence;
import irvine.util.Permutation;

/**
 * A167233
 * @author Sean A. Irvine
 */
public class A167233 extends FiniteSequence {

  /** Construct the sequence. */
  public A167233() {
    super(1, FINITE, build());
  }

  private static List<Z> build() {
    final Permutation perm = new Permutation(new int[] {1, 2, 3, 4, 5, 6, 7, 9});
    final ArrayList<Z> res = new ArrayList<>();
    int[] p;
    while ((p = perm.next()) != null) {
      final Z t = Permutation.permToZ(p);
      if (t.isProbablePrime()) {
        res.add(t);
      }
    }
    return res;
  }
}

