package irvine.oeis.a144;
// Generated by gen_seq4.pl tricut2

import irvine.oeis.a000.A000027;
import irvine.oeis.a101.A101468;
import irvine.oeis.triangle.PrependColumn;

/**
 * A144693 Triangle read by rows, A000012 * (3*A144328 - 2*A000012), where A000012 means a lower triangular matrix of all 1's.
 * @author Georg Fischer
 */
public class A144693 extends PrependColumn {

  /** Construct the sequence. */
  public A144693() {
    super(1, new A101468(), new A000027());
  }
}

