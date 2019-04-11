package irvine.oeis.a009;

/**
 * A009304 If <code>a,</code> b in sequence, so is ab+5.
 * @author Sean A. Irvine
 */
public class A009304 extends A009293 {

  @Override
  protected long add() {
    return 5;
  }
}
