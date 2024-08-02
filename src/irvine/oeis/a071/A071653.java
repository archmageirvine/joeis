package irvine.oeis.a071;

/**
 * A071653.
 * @author Sean A. Irvine
 */
public class A071653 extends A071651 {

  /** Construct the sequence. */
  public A071653() {
    super((x, y) -> x.add(y).square().add(y.multiply(3)).add(x).divide2());
  }
}
