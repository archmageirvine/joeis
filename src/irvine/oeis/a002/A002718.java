package irvine.oeis.a002;

import irvine.oeis.a060.A060053;
import irvine.oeis.transform.Stirling2TransformSequence;

/**
 * A002718 Number of bicoverings of an n-set.
 * @author Sean A. Irvine
 */
public class A002718 extends Stirling2TransformSequence {

  /** Construct the sequence. */
  public A002718() {
    super(new A060053(), 0);
  }
}
