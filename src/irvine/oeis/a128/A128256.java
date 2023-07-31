package irvine.oeis.a128;
// manually tricut2 2023-07-31

import irvine.oeis.a001.A001057;
import irvine.oeis.a126.A126258;
import irvine.oeis.triangle.PrependColumn;

/**
 * A128256 A004736(signed) * A007318.
 * @author Georg Fischer
 */
public class A128256 extends PrependColumn {

  /** Construct the sequence. */
  public A128256() {
    super(1, new A126258(), new A001057().skip(1));
  }
}

