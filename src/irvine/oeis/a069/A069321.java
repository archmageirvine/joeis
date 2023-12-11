package irvine.oeis.a069;
// Manually modified 2020-09-22

import irvine.oeis.PrependSequence;
import irvine.oeis.a001.A001563;
import irvine.oeis.transform.Stirling2TransformSequence;

/**
 * A069321 Stirling transform of A001563: a(0) = 1 and a(n) = Sum_{k=1..n} Stirling2(n,k)*k*k! for n &gt;= 1.
 * @author Georg Fischer
 */
public class A069321 extends PrependSequence {

  /** Construct the sequence. */
  public A069321() {
    super(new Stirling2TransformSequence(new A001563(),  0).skip(1), 1);
  }
}
