package irvine.oeis.a181;
// Generated by gen_seq4.pl tricut1

import irvine.oeis.a159.A159856;
import irvine.oeis.triangle.TruncatedTriangle;

/**
 * A181690 Riordan array T((1-x)^(-2) | 2x-1) read by rows.
 * @author Georg Fischer
 */
public class A181690 extends TruncatedTriangle {

  /** Construct the sequence. */
  public A181690() {
    super(0, new A159856());
  }
}

