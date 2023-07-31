package irvine.oeis.a193;
// manually tricut2 2023-07-31

import irvine.oeis.PrependSequence;
import irvine.oeis.a020.A020988;
import irvine.oeis.a130.A130329;
import irvine.oeis.triangle.PrependColumn;

/**
 * A193900 Mirror of the triangle A193899.
 * @author Georg Fischer
 */
public class A193900 extends PrependColumn {

  /** Construct the sequence. */
  public A193900() {
    super(0, new A130329(), new PrependSequence(new A020988().skip(1), 1));
  }
}

