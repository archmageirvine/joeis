package irvine.oeis.a313;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A313269 Coordination sequence Gal.5.200.1 where Gal.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A313269 extends TilingSequence {

  /** Construct the sequence. */
  public A313269() {
    super(0, new String[]
        { "6.4.4.3;B60+2,A60-2,A240-3,C120+1"
        , "6.3.3.3.3;D60+2,A300+1,C60+5,B300-4,E0+3"
        , "4.4.3.3.3;A240+4,C180+2,A300-4,B240-3,B300+3"
        , "6.3.3.3.3;D180-1,B300+1,E300+2,D180+4,E120+1"
        , "3.3.3.3.3.3;D240+5,D60+3,B0+5,B300-5,D240-3,D60-5"
        });
    defineBaseSet(0);
  }
}
