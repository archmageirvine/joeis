package irvine.oeis.a349;
// manually tricut2

import irvine.oeis.PrependSequence;
import irvine.oeis.a001.A001791;
import irvine.oeis.a100.A100100;
import irvine.oeis.triangle.PrependColumn;

/**
 * A349727 Triangle read by rows, T(n, k) = [x^(n - k)] hypergeom([-n, -1 + n], [-n], x).
 * @author Georg Fischer
 */
public class A349727 extends PrependColumn {

  /** Construct the sequence. */
  public A349727() {
    super(0, new A100100(), new PrependSequence(new A001791(), 1));
  }
}

