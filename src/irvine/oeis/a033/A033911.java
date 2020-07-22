package irvine.oeis.a033;

/**
 * A033911 Numbers n such that <code>s(n)+s(n+1)+...+s(n+3)=t(n)+t(n+1)+...+t(n+3)</code>.
 * @author Sean A. Irvine
 */
public class A033911 extends A033910 {

  @Override
  protected long m() {
    return 3;
  }
}
