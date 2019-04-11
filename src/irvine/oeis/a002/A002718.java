package irvine.oeis.a002;

import irvine.oeis.Stirling2TransformSequence;
import irvine.oeis.a060.A060053;

/**
 * A002718 Number of bicoverings of <code>an</code> n-set.
 * @author Sean A. Irvine
 */
public class A002718 extends Stirling2TransformSequence {

  /** Construct the sequence. */
  public A002718() {
    super(new A060053(), 0);
  }
}
