package irvine.oeis.a259;

import irvine.math.z.Z;
import irvine.oeis.recur.LinearRecurrence;

/**
 * A259404 Pentagonal numbers (A000326) that are the sum of twelve consecutive pentagonal numbers.
 * @author Sean A. Irvine
 */
public class A259404 extends LinearRecurrence {

  /** Construct the sequence. */
  public A259404() {
    super(1, new long[] {1, -1, -7300802, 7300802, 1},
      new Z[] {
        Z.valueOf(417912),
        Z.valueOf(9706632),
        Z.valueOf(3050311681782L),
        Z.valueOf(70865417283102L),
        new Z("22269721626195937752")
      });
  }
}
