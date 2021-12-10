package irvine.oeis.a033;

import irvine.oeis.transform.Stirling2TransformSequence;
import irvine.oeis.a000.A000290;

/**
 * A033452 "STIRLING" transform of squares A000290.
 * @author Sean A. Irvine
 */
public class A033452 extends Stirling2TransformSequence {

  /** Construct the sequence. */
  public A033452() {
    super(new A000290(), 0);
  }
}

