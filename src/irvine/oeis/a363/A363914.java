package irvine.oeis.a363;
// Generated by gen_seq4.pl tricut2

import irvine.oeis.a000.A000007;
import irvine.oeis.a054.A054525;
import irvine.oeis.triangle.PrependColumn;

/**
 * A363914 The Moebius triangle read by rows. Inverse matrix of the divisibility triangle A113704.
 * @author Georg Fischer
 */
public class A363914 extends PrependColumn {

  /** Construct the sequence. */
  public A363914() {
    super(0, new A054525(), new A000007());
  }
}

