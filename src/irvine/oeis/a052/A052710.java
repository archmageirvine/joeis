package irvine.oeis.a052;
// manually 2021-11-05

import irvine.oeis.HolonomicRecurrence;

/**
 * A052710 A simple context-free grammar.
 * @author Georg Fischer
 */
public class A052710 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A052710() {
    super(0, "[[0]],[2304,-4608,-36864, 73728],[46368, 121536, 59904,-9216],[-79800,-56512, 59520, 34048],[185964, 200516, 68544, 7456],[6864,-22732,-15024,-2228],[-13020,-10199,-2604,-217]]", "0, 0, 0, 0, 1, 4, 14", 5);
  }
}
