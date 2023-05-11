package irvine.oeis.a063;

import irvine.oeis.InverseSequence;
import irvine.oeis.PrependSequence;

/**
 * A063692.
 * @author Sean A. Irvine
 */
public class A063741 extends InverseSequence {

  /** Construct the sequence. */
  public A063741() {
    super(new PrependSequence(new A063740(), 1, -1), 0, 0);
  }
}

