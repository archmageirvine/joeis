package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.WolframAutomata;

/**
 * A048713 3rd row of Family 1 "90 x 150 array": generations 0 .. n of Rule 90 starting from seed pattern 21.
 * @author Sean A. Irvine
 */
public class A048713 extends WolframAutomata {

  /** Construct the sequence. */
  public A048713() {
    super(90, Z.valueOf(21));
  }
}
