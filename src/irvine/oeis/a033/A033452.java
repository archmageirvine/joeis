package irvine.oeis.a033;

import irvine.oeis.Stirling2TransformSequence;
import irvine.oeis.a000.A000290;

/**
 * A033452 "STIRLING" transform of squares <code>A000290</code>.
 * @author Sean A. Irvine
 */
public class A033452 extends Stirling2TransformSequence {

  /** Construct the sequence. */
  public A033452() {
    super(new A000290(), 0);
  }
}

