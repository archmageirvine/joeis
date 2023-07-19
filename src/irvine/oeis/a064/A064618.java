package irvine.oeis.a064;

import irvine.oeis.a001.A001044;
import irvine.oeis.transform.Stirling2TransformSequence;

/**
 * A064618 Stirling transform of (n!)^2.
 * @author Sean A. Irvine
 */
public class A064618 extends Stirling2TransformSequence {

  /** Construct the sequence. */
  public A064618() {
    super(0, new A001044(), 0);
  }
}
