package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;

/**
 * A048242 Numbers that are not the sum of two abundant numbers (not necessarily distinct).
 * @author Sean A. Irvine
 */
public class A048242 extends ComplementSequence {

  /** Construct the sequence. */
  public A048242() {
    super(new A048260(), Z.ONE);
  }
}

//public class A048242 extends FiniteSequence {
//
//  /** Construct the sequence. */
//  public A048242() {
//    super(build());
//  }
//
//  private static long[] build() {
//    final TreeSet<Integer> s = new TreeSet<>();
//    for (int k = 1; k <= 16695; ++k) {
//      if (Cheetah.factor(k).sigma().intValueExact() > 2 * k) {
//        s.add(k);
//      }
//    }
//    final boolean[] is = new boolean[20162];
//    for (final int u : s) {
//      for (final int v : s) {
//        if (u + v < is.length) {
//          is[u + v] = true;
//        }
//        if (v == u) {
//          break;
//        }
//      }
//    }
//    final long[] terms = new long[1456];
//    for (int j = 0, k = 1; k < is.length; ++k) {
//      if (!is[k]) {
//        terms[j++] = k;
//      }
//    }
//    return terms;
//  }
//}
