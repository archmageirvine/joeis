package irvine.oeis.a006;

/**
 * A006658 Closed meanders with 3 components and 2n bridges.
 * @author Sean A. Irvine
 */
public class A006658 extends A006657 {

  {
    setOffset(3);
  }

  @Override
  protected int components() {
    return 3;
  }
}
