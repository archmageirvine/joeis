package irvine.oeis.a056;

import irvine.oeis.InverseSequence;

/**
 * A056817 Least inverse of A056796.
 * @author Sean A. Irvine
 */
public class A056817 extends InverseSequence {

  /** Construct the sequence. */
  public A056817() {
    super(new A056796(), 0, 0);
  }
}
