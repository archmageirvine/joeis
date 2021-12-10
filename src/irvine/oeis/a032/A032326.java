package irvine.oeis.a032;

import irvine.oeis.transform.ChjTransformSequence;
import irvine.oeis.a059.A059841;

/**
 * A032326 Number of ways to partition n labeled elements into pie slices of odd sizes forming an aperiodic pattern.
 * @author Sean A. Irvine
 */
public class A032326 extends ChjTransformSequence {

  /** Construct the sequence. */
  public A032326() {
    super(new A059841());
  }
}
