package irvine.oeis.a033;

/**
 * A033913 Numbers n such that <code>s(n)+s(n+1)+...+s(n+6)=t(n)+t(n+1)+...+t(n+6)</code>.
 * @author Sean A. Irvine
 */
public class A033913 extends A033910 {

  @Override
  protected long m() {
    return 6;
  }
}
