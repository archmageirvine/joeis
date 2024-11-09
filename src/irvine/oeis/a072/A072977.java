package irvine.oeis.a072;

import irvine.oeis.RecordSequence;
import irvine.oeis.a039.A039921;

/**
 * A072977 Increasing partial quotients of w = 2*cos(Pi/7).
 * @author Sean A. Irvine
 */
public class A072977 extends RecordSequence {

  /** Construct the sequence. */
  public A072977() {
    super(new A039921());
  }
}

