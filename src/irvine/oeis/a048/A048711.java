package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.WolframAutomata;

/**
 * A048711 2nd row of Family 1 "90 X 150 array": generations 0 .. n of Rule 90 starting from seed pattern 7.
 * @author Sean A. Irvine
 */
public class A048711 extends WolframAutomata {

  /** Construct the sequence. */
  public A048711() {
    super(90, Z.SEVEN);
  }
}
