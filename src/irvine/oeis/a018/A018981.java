package irvine.oeis.a018;

/**
 * A018981 Cycle class sequence c(2n) (the number of true cycles of length <code>2n</code> in which a certain node is included) for zeolite AST = AlPO4-16 [ Al20P20O80 <code>] </code>.4 R . 16 H2O.
 * @author Sean A. Irvine
 */
public class A018981 extends A018940 {

  @Override
  protected String getNeighbourhoodDescription() {
    // AST
    return "a-1: a-9(000) b-8(000) a-5(000) b-4(000)\n"
      + "b-4: a-7(00+) b-6(0+0)\n"
      + "a-5: b-10(0++) a-7(+0+) b-6(++0)\n"
      + "b-8: b-10(00+)\n"
      + "a-9: b-10(0+0)\n"
      + "b-2: a-9(--0) b-8(-0-) b-4(0--) a-3(000)\n"
      + "a-3: b-10(000) a-7(000) b-6(000)\n"
      + "b-6: b-8(-00)\n"
      + "a-7: a-9(-00)\n";
  }
}

