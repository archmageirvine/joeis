package irvine.oeis.a033;

/**
 * A033916 Numbers n such that <code>s(n)+s(n+1)+...+s(n+14)=t(n)+t(n+1)+...+t(n+14)</code>.
 * @author Sean A. Irvine
 */
public class A033916 extends A033910 {

  @Override
  protected long m() {
    return 14;
  }
}
