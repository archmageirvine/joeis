package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.WolframAutomata;

/**
 * A048712 2nd column of Family 1 "90 X 150 array": generations 0 .. n of Rule 150 starting from seed pattern 5.
 * @author Sean A. Irvine
 */
public class A048712 extends WolframAutomata {

  /** Construct the sequence. */
  public A048712() {
    super(150, Z.FIVE);
  }
}
