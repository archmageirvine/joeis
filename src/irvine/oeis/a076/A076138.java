package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a006.A006513;

/**
 * A076138 a(1)=1; a(n+1) is the smallest integer &gt; a(n) such that C_2k(a(n+1))=C_2k(a(n)) for k large enough, where C_m(n) is the modified Collatz map iterated m times on n ( x-&gt;x/2 if x is even x-&gt;(3x+1)/2 if x is odd).
 * @author Sean A. Irvine
 */
public class A076138 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A076138() {
    super(1, 1, new A006513(), Z.ONE::equals);
  }
}
