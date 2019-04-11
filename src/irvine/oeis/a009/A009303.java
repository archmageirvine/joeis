package irvine.oeis.a009;

/**
 * A009303 If <code>a,</code> b in sequence, so is ab+4.
 * @author Sean A. Irvine
 */
public class A009303 extends A009293 {

  @Override
  protected long add() {
    return 4;
  }
}
