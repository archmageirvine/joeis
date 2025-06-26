package irvine.oeis.a384;

import irvine.oeis.Combiner;
import irvine.oeis.PrependSequence;
import irvine.oeis.a002.A002464;
import irvine.oeis.a002.A002493;

/**
 * A384921 Number of permutations [p_1, p_2, ..., p_n], for n &gt;= 1,  with |p_{i+1} - p_i| &gt;= 2, for i = 1..n-1, and |p_n - p_1| = 0 or 1.
 * @author Sean A. Irvine
 */
public class A384921 extends PrependSequence {

  /** Construct the sequence. */
  public A384921() {
    super(1, new Combiner(new A002464().skip(2), new A002493().skip(), Combiner.SUBTRACT), 1);
  }
}

