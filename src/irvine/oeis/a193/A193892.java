package irvine.oeis.a193;
// manually tricut2 2023-07-31

import irvine.oeis.PrependSequence;
import irvine.oeis.a007.A007290;
import irvine.oeis.a104.A104634;
import irvine.oeis.triangle.PrependColumn;

/**
 * A193892 Mirror of the triangle A193891.
 * @author Georg Fischer
 */
public class A193892 extends PrependColumn {

  /** Construct the sequence. */
  public A193892() {
    super(0, new A104634(), new PrependSequence(new A007290().skip(3), 1));
  }
}

