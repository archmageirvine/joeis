package irvine.oeis.a121;
// Generated by gen_seq4.pl tricut2

import irvine.oeis.a000.A000004;
import irvine.oeis.a178.A178820;
import irvine.oeis.triangle.PrependColumn;

/**
 * A121547 Fourth slice along the 1-2-plane in the cube a(m,n,o) = a(m-1,n,o) + a(m,n-1,o) + a(m,n,o-1) for which the first slice is Pascal's triangle (slice read by antidiagonals).
 * @author Georg Fischer
 */
public class A121547 extends PrependColumn {

  /** Construct the sequence. */
  public A121547() {
    super(0, new A178820(), new A000004());
  }
}

