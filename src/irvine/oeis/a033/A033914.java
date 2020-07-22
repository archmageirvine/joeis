package irvine.oeis.a033;

/**
 * A033914 Numbers n such that <code>s(n)+s(n+1)+...+s(n+7)=t(n)+t(n+1)+...+t(n+7)</code>.
 * @author Sean A. Irvine
 */
public class A033914 extends A033910 {

  @Override
  protected long m() {
    return 7;
  }
}
