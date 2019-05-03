package irvine.oeis.a009;

/**
 * A009303 If a, b in sequence, so is <code>ab+4</code>.
 * @author Sean A. Irvine
 */
public class A009303 extends A009293 {

  @Override
  protected long add() {
    return 4;
  }
}
