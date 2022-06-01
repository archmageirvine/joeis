package irvine.oeis.a258;

import irvine.math.z.Z;
import irvine.oeis.recur.LinearRecurrence;

/**
 * A258129 Octagonal numbers (A000567) that are the sum of three consecutive octagonal numbers.
 * @author Sean A. Irvine
 */
public class A258129 extends LinearRecurrence {

  /** Construct the sequence. */
  public A258129() {
    super(new long[] {1, -7300803, 7300803},
      new Z[] {
        Z.valueOf(698901),
        Z.valueOf(5102520783381L),
        new Z("37252493940331837461")
    });
  }
}
