package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.WolframAutomata;

/**
 * A048714 3rd column of Family 1 "90 x 150 array": generations 0 .. n of Rule 150 starting from seed pattern 17.
 * @author Sean A. Irvine
 */
public class A048714 extends WolframAutomata {

  /** Construct the sequence. */
  public A048714() {
    super(150, Z.valueOf(17));
  }
}
