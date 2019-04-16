package irvine.oeis.a019;

import java.util.Set;

import irvine.math.z.Z;

/**
 * A019990 A threequence, a 3-way partitioning of the integers: define <code>a,b</code>,c,A,B,C by a(0)=true, b(0)=c(0)=A(0)=B(0)=C(0)=false, a(n)=a(m) OR C(m) OR B(m), <code>b(n)=</code> b(m) OR A(m) OR C(m), c(n)= c(m) OR B(m) OR A(m), A(n)= A(m) OR b(m) OR c(m), B(n)= B(m) OR c(m) OR a(m), <code>C(n)=</code> C(m) OR a(m) OR b(m), where m <code>= [ (n+1)/3 ]</code>; sequence gives n such that <code>b(2n)</code> is true.
 * @author Sean A. Irvine
 */
public class A019990 extends A019989 {

  @Override
  protected boolean accept(final Z n, final Set<Z> a, final Set<Z> b, final Set<Z> c) {
    return b.contains(n);
  }
}
