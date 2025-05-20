package irvine.oeis.a077;

import java.util.TreeSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077391 Smallest n-digit prime which leaves a prime at every step if most significant digit and least significant digit are deleted until a one digit or two digit prime is obtained, or 0 if no such prime exists.
 * @author Sean A. Irvine
 */
public class A077391 extends Sequence1 {

  private static final String[] SUFFIX = {"1", "3", "7", "9"};
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    // Work the String rather than Z to handle peculiar leading 0s in this sequence
    TreeSet<String> set = new TreeSet<>();
    if ((mN & 1) == 1) {
      set.add("2");
      set.add("3");
      set.add("5");
      set.add("7");
    } else {
      if (mN > 2) {
        set.add("02");
        set.add("03");
        set.add("05");
        set.add("07");
      }
      for (long p = 11; p < 100; p = Functions.NEXT_PRIME.l(p)) {
        set.add(String.valueOf(p));
      }
    }
    String min = null;
    while (set.first().length() != mN) {
      final int start = set.first().length() + 2 == mN ? 1 : 0;
      final TreeSet<String> next = new TreeSet<>();
      for (final String s : set) {
        for (final String suffix : SUFFIX) {
          for (int pre = start; pre < 10; ++pre) {
            final String u = pre + s + suffix;
            final Z t = new Z(u);
            if (t.isProbablePrime()) {
              if (u.length() == mN) { // Contortions to avoid storing tree for last iteration
                if (min == null || u.compareTo(min) < 0) {
                  min = u;
                }
              } else {
                next.add(u);
//                if (next.size() > 1000) { // Search is way faster with this heuristic but cannot guarantee result
//                  next.pollLast();
//                }
              }
            }
          }
        }
      }
      if (min != null) {
        next.add(min);
      }
      set = next;
    }
    return new Z(set.first());
  }
}
