package irvine.oeis.a064;

import irvine.oeis.cons.BeattySequence;

/**
 * A064488 A Beatty sequence: Floor[n*c], where c = A064648 is the sum of the reciprocals of primorials.
 * @author Sean A. Irvine
 */
public class A064488 extends BeattySequence {

  /** Construct the sequence. */
  public A064488() {
    super(1, new A064648().getCR());
  }
}
