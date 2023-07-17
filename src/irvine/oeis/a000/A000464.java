package irvine.oeis.a000;

/**
 * A000464 Expansion of sin x /cos 2x.
 * @author Sean A. Irvine
 */
public class A000464 extends A000061 {

  /** Construct the sequence. */
  public A000464() {
    super(0);
  }

  @Override
  protected int getA() {
    return 2;
  }

  @Override
  protected int getN() {
    return ++mT;
  }
}
