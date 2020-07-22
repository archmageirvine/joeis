package irvine.oeis.a033;

/**
 * A033912 Numbers n such that <code>s(n)+s(n+1)+...+s(n+4)=t(n)+t(n+1)+...+t(n+4)</code>.
 * @author Sean A. Irvine
 */
public class A033912 extends A033910 {

  @Override
  protected long m() {
    return 4;
  }
}
