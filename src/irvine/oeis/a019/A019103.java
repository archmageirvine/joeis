package irvine.oeis.a019;

/**
 * A019103 Cycle class sequence c(n) (the number of true cycles of length n in which a certain node is included) for zeolite DAC = Dachiardite Na5[Al5Si19O48].12H2O starting with a T2 atom.
 * @author Sean A. Irvine
 */
public class A019103 extends A019102 {

  @Override
  protected String startNode() {
    return "b-2";
  }
}
