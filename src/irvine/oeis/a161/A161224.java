package irvine.oeis.a161;
// manually tricut2 2023-07-31

import irvine.oeis.PrependSequence;
import irvine.oeis.a066.A066633;
import irvine.oeis.a196.A196087;
import irvine.oeis.triangle.PrependColumn;

/**
 * A161224 Triangular table a(n,m) that counts the occurrences of m in all partitions of 2n in exactly n parts.
 * @author Georg Fischer
 */
public class A161224 extends PrependColumn {

  /** Construct the sequence. */
  public A161224() {
    super(0, new A066633(), new PrependSequence(new A196087(), 0));
  }
}

