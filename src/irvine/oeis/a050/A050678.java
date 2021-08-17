package irvine.oeis.a050;

import irvine.oeis.PositionOfNSequence;

/**
 * A050678 First occurrence of n in A050677.
 * @author Sean A. Irvine
 */
public class A050678 extends PositionOfNSequence {

  /** Construct the sequence. */
  public A050678() {
    super(new A050677());
  }
}
