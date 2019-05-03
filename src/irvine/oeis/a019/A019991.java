package irvine.oeis.a019;

import java.util.Set;

import irvine.math.z.Z;

/**
 * A019991 A threequence, a 3-way partitioning of the integers: define a,b,c,A,B,C by <code>a(0)=true, b(0)=c(0)=A(0)=B(0)=C(0)=false, a(n)=a(m)</code> OR <code>C(m)</code> OR <code>B(m), b(n)= b(m)</code> OR <code>A(m)</code> OR <code>C(m), c(n)= c(m)</code> OR <code>B(m)</code> OR <code>A(m), A(n)= A(m)</code> OR <code>b(m)</code> OR <code>c(m), B(n)= B(m)</code> OR <code>c(m)</code> OR <code>a(m), C(n)= C(m)</code> OR <code>a(m)</code> OR <code>b(m)</code>, where m <code>= [ (n+1)/3 ]</code>; sequence gives n such that <code>c(2n)</code> is true.
 * @author Sean A. Irvine
 */
public class A019991 extends A019989 {

  @Override
  protected boolean accept(final Z n, final Set<Z> a, final Set<Z> b, final Set<Z> c) {
    return c.contains(n);
  }
}
