package irvine.oeis.a050;

import irvine.oeis.PositionOfNSequence;
import irvine.oeis.a048.A048288;

/**
 * A050678 Index of first occurrence of n in A048288.
 * @author Sean A. Irvine
 */
public class A050678 extends PositionOfNSequence {

  /** Construct the sequence. */
  public A050678() {
    super(new A048288());
  }
}
