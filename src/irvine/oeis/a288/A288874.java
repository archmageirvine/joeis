package irvine.oeis.a288;
// Generated by gen_seq4.pl tricut2

import irvine.oeis.a000.A000007;
import irvine.oeis.a112.A112007;
import irvine.oeis.triangle.PrependColumn;

/**
 * A288874 Row reversed version of triangle A201637 (second-order Eulerian triangle).
 * @author Georg Fischer
 */
public class A288874 extends PrependColumn {

  /** Construct the sequence. */
  public A288874() {
    super(0, new A112007(), new A000007());
  }
}

