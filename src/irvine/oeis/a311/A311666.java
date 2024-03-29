package irvine.oeis.a311;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A311666 Coordination sequence Gal.4.108.1 where Gal.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A311666 extends TilingSequence {

  /** Construct the sequence. */
  public A311666() {
    super(0, new String[]
        { "6.4.3.4;B60+2,B300+1,C180+3,C300-3"
        , "6.4.3.4;A60+2,A300+1,D30+1,D210+4"
        , "12.3.4.3;C180-1,C120-2,A180+3,D330+3"
        , "4.3.4.3.3;B330+3,C210-4,C30+4,B150+4,D180+5"
        });
    defineBaseSet(0);
  }
}
