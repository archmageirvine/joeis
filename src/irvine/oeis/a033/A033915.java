package irvine.oeis.a033;

/**
 * A033915 Numbers n such that s(n)+s(n+1)+...+s(n+10)=t(n)+t(n+1)+...+t(n+10).
 * @author Sean A. Irvine
 */
public class A033915 extends A033910 {

  @Override
  protected long m() {
    return 10;
  }
}
