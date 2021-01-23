package irvine.oeis.a036;

import irvine.oeis.UnionSequence;

/**
 * A036344 Prime concatenated analog clock numbers (clockwise and counterclockwise).
 * @author Sean A. Irvine
 */
public class A036344 extends UnionSequence {

  /** Construct the sequence. */
  public A036344() {
    super(new A036342(), new A036343());
  }
}
