package irvine.oeis.a057;

import irvine.oeis.InverseSequence;
import irvine.oeis.a005.A005132;

/**
 * A057167 Term in Recam\u00e1n's sequence A005132 where n appears for first time, or -1 if n never appears.
 * @author Sean A. Irvine
 */
public class A057167 extends InverseSequence {

  /** Construct the sequence. */
  public A057167() {
    super(0, new A005132(), 0, 0);
  }
}

